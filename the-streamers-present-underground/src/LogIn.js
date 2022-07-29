import React from "react";
const LogIn = () => {
return (
 <div className="LogIn">
  <div style={{
             backgroundImage: `url("https://img.atlasobscura.com/89v1Qj7ECKUmNfvaURy3SJf8IzoXkuNLDIvgLt5TOiQ/rt:fit/w:1200/q:81/sm:1/scp:1/ar:1/aHR0cHM6Ly9hdGxh/cy1kZXYuczMuYW1h/em9uYXdzLmNvbS91/cGxvYWRzL3BsYWNl/X2ltYWdlcy9hOTI3/YjJiNjI4NTQ4MTBl/MmJfMThGRFIxMTEx/LmpwZw.jpg")`,
             backgroundSize: 'cover',
             backgroundRepeat: 'no-repeat',
             width: '100vw',
             height: '100vh',
             textAlign: 'center',
             paddingTop: '250px'
           }}>
      <h3 style = {{
                  fontSize: '36px',
                  color: 'yellow',
                  fontWeight: 'bold',
                  marginRight: '1200px'
      }}
      >User Login</h3>

      <input style = {{
                     fontSize: '24px',
                     marginRight: '1000px'
      }}
      type="text" placeholder="User ID"/>
      <br />
      <br/>
      <input style = {{
                     fontSize: '24px',
                     marginRight: '900px'
      }}
      type="password" placeholder="Password"/>
      <br />
      <br/>
      <button style={{
                    fontSize: '24px',
                    border: '3px solid yellow',
                    color: 'yellow',
                    backgroundColor: 'transparent',
                    fontWeight: 'bold',
                    marginRight: '900px'
                    }}
      onClick={() => {window.location = window.location.origin+"/playlists"}}> ENTER </button>
 </div>
 </div>
)
}
export default LogIn;