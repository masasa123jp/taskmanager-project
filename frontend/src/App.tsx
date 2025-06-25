import React,{useState,useEffect} from 'react';
const App:React.FC=()=>{const[ok,setOk]=useState(false);useEffect(()=>{setOk(true);},[]);
return <div style={{textAlign:'center'}}><h2>Task Manager Frontend</h2>{ok?"React Works!":""}</div>;};
export default App;
