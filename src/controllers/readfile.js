const fs = require("fs");

const readFileJSON = (req, res) => {
  const filePath = __dirname + "/output.json";

  fs.readFile(filePath, (err, json) => {
    let obj = JSON.parse(json);
    res.json(obj);
  });
};

module.exports = {
  readFileJSON,
};
