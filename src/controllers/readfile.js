const fs = require("fs");
const filePath = __dirname + "/output.json";

const jsonFile = require(filePath);
const readFileJSON = (req, res) => {
  res.json(jsonFile);
};
const readFileJSONFillByCountry = (req, res) => {
  let countryFilltered = jsonFile.children;
  const result = [];
  countryFilltered.map((year) => {
    for (const props in year.children) {
      for (const nextProps in year.children[props].children) {
        for (const nextNextProps in year.children[props].children[nextProps].children) {
          console.log(
            year.children[props].children[nextProps].children[nextNextProps].country
          );
          for (const countryProps in year.children[props].children[nextProps].children[nextNextProps].country){
            if (year.children[props].children[nextProps].children[nextNextProps].country[countryProps] === req.params.country ) {
                console.log(year.children[props].children[nextProps].children[nextNextProps]);
            }
            console.log(year.children[props].children[nextProps].children[nextNextProps].country[countryProps]);
          }
          
        }
      }
    }
    console.log(result);
    res.json(year.children);
    console.log(performance.now());
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
