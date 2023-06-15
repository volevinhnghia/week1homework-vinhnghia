const fs = require("fs");

const writeFileJSON = (req, res) => {
  const data = req.body;
  const filePath = __dirname + "/output.json";

  fs.appendFile(filePath, JSON.stringify(data), (err) => {
    if (err) {
      throw err;
    }
    res.status(200).json({
      message: "File successfully written",
    });
  });
};
module.exports = {
  writeFileJSON,
};
