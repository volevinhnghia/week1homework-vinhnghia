const express = require('express');
const router = express.Router();
const writeFileControllers = require('../controllers/writefile');


router.post('/file',writeFileControllers.writeFileJSON);

module.exports = router;