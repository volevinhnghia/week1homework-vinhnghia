const express = require("express");
const app = express();
const fs = require("fs");
const writefileRouter = require('./routes/writefile');
const readfileRouter = require('./routes/readfile');
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
const port = 8000;

app.use('/v1/', writefileRouter);
app.use('/v1/', readfileRouter);
app.get('/',(req, res) => {res.send('Hello world!')})

app.listen(port,()=>{
    console.log(`listening on port ${port}`);
})