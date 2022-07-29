import logo from './logo.svg';
import './App.css';
import React from "react";
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import LandingPage from './LandingPage.js';
import LogIn from './LogIn.js';
import UserPlaylists from './UserPlaylists.js';
import Underground from './Underground.js';

function App() {
  return (
  <BrowserRouter>
    <Routes>
      <Route exact path='/' element={<LandingPage/>}/>
      <Route exact path='/user-login' element={<LogIn/>}/>
      <Route exact path='/playlists' element={<UserPlaylists/>}/>
      <Route exact path='/underground' element={<Underground/>}/>
    </Routes>
  </BrowserRouter>
  );
}

export default App;
