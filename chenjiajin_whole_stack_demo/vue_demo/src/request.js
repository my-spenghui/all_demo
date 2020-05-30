import axios from "axios";

//创建axios的请求路径头和超时时间
const service = axios.create({
    baseURL: "http://localhost:8089",
    timeout: 5000
})

//只有export了   在getData.js里面才可以 import
export default service;
