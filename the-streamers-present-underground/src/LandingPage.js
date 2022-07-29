import logo from './logo.svg';
import './App.css';
import { Route } from 'react-router-dom';
import React from "react";

function LandingPage() {
  return (
    <div style={{
          backgroundImage: `url("https://imgs.6sqft.com/wp-content/uploads/2020/08/17112620/191st-Street-subway-tunnel-James-and-Karla-Murray-5.jpg")`,
          backgroundSize: 'cover',
          backgroundRepeat: 'no-repeat',
          width: '100vw',
          height: '100vh',
          textAlign: 'center',
          paddingTop: '200px',
          paddingLeft: '40px'
        }}>
     <h1 style={{
     fontSize: '48px',
     color: 'white'
     }}
     >The Streamers</h1>
     }
           <h2 style={{
                    fontSize: '36px',
                    color: 'white'
                    }}
           >present</h2>
           <h1 style={{
                   fontSize: '72px',
                   color: 'white'
                   }}
           >Underground</h1>
           <button style={{
           marginTop: '50px',
           padding: '20px',
           fontSize: '24px',
           border: '2px solid white',
           backgroundColor: 'transparent',
           color: 'white',
           fontWeight: 'bold'
           }}
           onClick={() => {window.location = window.location.origin+"/user-login"}}> Click To Enter </button>
         </div>
  );
}

export default LandingPage;