import React from "react";

const undergroundGeneratedPlaylist = [
{trackNumber: "01", genreKey: "RG", artist: "Sizzla", songTitle: "Give Me A Try"},
{trackNumber: "02", genreKey: "RG", artist: "Burning Spear", songTitle: "Marcus Garvey"},
{trackNumber: "03", genreKey: "RG", artist: "Dezarie", songTitle: "Most High"},
{trackNumber: "04", genreKey: "LN", artist: "Combo Chimbita", songTitle: "Brillo Mas Que El Oro, La Bala Apuntandome"},
{trackNumber: "05", genreKey: "LN", artist: "The Citie", songTitle: "Nena"},
{trackNumber: "06", genreKey: "ST", artist: "Mica Levi", songTitle: "Children"},
{trackNumber: "07", genreKey: "LN", artist: "Cimafunk",songTitle:  "Parar el Tiempo"},
{trackNumber: "08", genreKey: "ST", artist: "Patrick Doyle", songTitle: "Harry In Winter"},
{trackNumber: "09", genreKey: "RG", artist: "Junior Tshaka", songTitle: "La Jungle"},
{trackNumber: "10", genreKey: "LN", artist: "Inner Wave", songTitle: "American Spirits"}
]

const Underground = () => {

return (
 <div className="Underground">
 <div style={{
           backgroundImage: `url("https://images.pexels.com/photos/1901028/pexels-photo-1901028.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")`,
           backgroundSize: 'cover',
           backgroundRepeat: 'no-repeat',
           width: '100vw',
           height: '100vh',
           paddingTop: '100px'
         }}>
      <h3 style={{
                fontSize: '36px',
                textAlign: 'center',
                fontWeight: '900',
                color: 'white',
                textShadow: '5px 5px 5px yellow'
      }}>
      Underground Playlist</h3>
      <br/>
      <body style={{
                  fontSize: '24px',
                  textAlign: 'center',
                  fontWeight: 'bold',
                  color: 'yellow',
                  textShadow: '5px 5px 5px white'

      }}>
      {undergroundGeneratedPlaylist.map(song => {return (
      <p><center>{song.artist}: {song.songTitle}</center></p>)})}
      </body>
      </div>
 </div>
 )
}

export default Underground;