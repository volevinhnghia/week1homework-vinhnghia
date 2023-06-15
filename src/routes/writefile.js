const express = require('express');
const router = express.Router();
const writeFileControllers = require('../controllers/writefile');


router.post('/writefile',writeFileControllers.writeFileJSON);

module.exports = router;