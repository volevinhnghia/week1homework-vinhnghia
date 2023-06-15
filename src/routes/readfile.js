const express = require('express');
const router = express.Router();


const readFileControllers = require('../controllers/readfile');


router.get('/readfile', readFileControllers.readFileJSON);

module.exports = router;