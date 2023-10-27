import axios from "axios";

export default axios.create({
    // baseURL:'https://9c96-103-106-239-104.ap.ngrok.io', 
    baseURL:'https://8261-2409-4051-4e12-a6c2-f8fe-59a3-48c-2e8d.ngrok-free.app', 
    headers: {"ngrok-skip-browser-warning": "true"}
   
});