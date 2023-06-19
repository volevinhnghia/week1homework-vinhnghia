const express = require('express');
const router = express.Router();


const readFileControllers = require('../controllers/readfile');


router.get('/file', readFileControllers.readFileJSON);
router.get('/file/:country', readFileControllers.readFileJSONFillByCountry);

module.exports = router;