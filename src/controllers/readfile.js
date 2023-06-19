const fs = require("fs");
const filePath = __dirname + "/output.json";

const jsonFile = require(filePath);
const readFileJSON = (req, res) => {
  res.json(jsonFile); // Read json file with api /file
};
const readFileJSONFillByCountry = (req, res) => { // find all country with params country
  let countryFilltered = jsonFile.children;
  const result = [];
  countryFilltered.map((year) => {
    for (const props in year.children) {
      for (const nextProps in year.children[props].children) {
        for (const nextNextProps in year.children[props].children[nextProps]
          .children) {
          // console.log(
          //   year.children[props].children[nextProps].children[nextNextProps].country
          // );
          //console.log(year.children[props].children[nextProps].children[nextNextProps].country === req.params.country);

          if (
            year.children[props].children[nextProps].children[nextNextProps]
              .country === req.params.country
          ) {
            //console.log(year.children[props].children[nextProps].children[nextNextProps]);
            result.push(
              year.children[props].children[nextProps].children[nextNextProps]
            );
          }
          //console.log(year.children[props].children[nextProps].children[nextNextProps].country);
        }
      }
    }
    console.log(req.params.country);
    console.log(result);
    res.json(result);
  });
  //   for (const props in countryFilltered) {
  //     console.log(countryFilltered[props]);
  //   }
  //   res.json(countryFilltered);
};
module.exports = {
  readFileJSON,
  readFileJSONFillByCountry,
};
