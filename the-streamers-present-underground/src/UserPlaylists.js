import React, {useState} from "react";

const aroundTheWorld = [
{trackNumber: "37", genreKey: "RG", artist: "Bob Marley", songTitle: "Could You Be Loved"},
{trackNumber: "32", genreKey: "RG", artist: "Peter Tosh", songTitle: "Legalize It"},
{trackNumber: "38", genreKey: "RG", artist: "Sister Nancy", songTitle: "Bam Bam"},
{trackNumber: "31", genreKey: "LN", artist: "Karol G", songTitle: "PROVENZA"},
{trackNumber: "34", genreKey: "LN", artist: "Becky G", songTitle: "MAMIII"},
{trackNumber: "33", genreKey: "ST", artist: "Henry Mancini", songTitle: "The Pink Panther Theme"},
{trackNumber: "36", genreKey: "LN", artist: "Bad Bunny",songTitle:  "Otro Atardecer"},
{trackNumber: "35", genreKey: "ST", artist: "Hans Zimmer", songTitle: "Now We Are Free"},
{trackNumber: "40", genreKey: "RG", artist: "Jimmy Cliff", songTitle: "Many Rivers To Cross"},
{trackNumber: "39", genreKey: "LN", artist: "Enrique Iglesias", songTitle: "Duele el Corazon"}
]
const easyListening = [
{trackNumber: "26", genreKey: "JZ", artist: "Billie Holiday", songTitle: "All Of Me"},
{trackNumber: "27", genreKey: "OL", artist: "The Eagles", songTitle: "Hotel California"},
{trackNumber: "28", genreKey: "IL", artist: "Vitamin String Quartet", songTitle: "Home"},
{trackNumber: "29", genreKey: "OL", artist: "The Doors", songTitle: "Riders On The Storm"},
{trackNumber: "30", genreKey: "IL", artist: "Ramin Djawadi", songTitle: "Light Of The Seven"},
{trackNumber: "21", genreKey: "JZ", artist: "Ella Fitzgerald", songTitle: "Dream A Little Dream Of Me"},
{trackNumber: "22", genreKey: "JZ", artist: "John Coltrane", songTitle: "My Favorite Things"},
{trackNumber: "23", genreKey: "IL", artist: "Max Richter", songTitle: "Spring 1 - 2012"},
{trackNumber: "24", genreKey: "OL", artist: "Fleetwood Mac", songTitle: "Silver Springs"},
{trackNumber: "25", genreKey: "OL", artist: "Carlos Santana", songTitle: "Black Magic Woman"}
]
const danceVibes = [
{trackNumber: "17", genreKey: "EC", artist: "David Guetta", songTitle: "Titanium"},
{trackNumber: "12", genreKey: "EC", artist: "Charli XCX", songTitle: "Beg For You"},
{trackNumber: "18", genreKey: "EC", artist: "Grimes", songTitle: "Oblivion"},
{trackNumber: "11", genreKey: "EC" , artist: "Daft Punk", songTitle: "Get Lucky"},
{trackNumber: "14", genreKey: "HR", artist: "Drake", songTitle: "Know Yourself"},
{trackNumber: "13", genreKey: "HR", artist: "Jack Harlow", songTitle: "First Class"},
{trackNumber: "16", genreKey: "HR", artist: "Lil Baby", songTitle: "Right On"},
{trackNumber: "15", genreKey: "POP", artist: "LF SYSTEM", songTitle: "Afraid To Feel"},
{trackNumber: "20", genreKey: "POP", artist: "GAYLE", songTitle: "abcdefu"},
{trackNumber: "20", genreKey: "POP", artist: "Britney Spears", songTitle: "Toxic"}
]

const superDuper = [
{trackNumber: "01", genreKey: "IND", artist: "Modest Mouse", songTitle: "Float On"},
{trackNumber: "02", genreKey: "IND", artist: "Billie Eilish", songTitle: "Ocean Eyes"},
{trackNumber: "03", genreKey: "IND", artist: "Keane", songTitle: "Walnut Tree"},
{trackNumber: "04", genreKey: "CY", artist: "The Chicks", songTitle: "Cowboy Take Me Away"},
{trackNumber: "05", genreKey: "AR", artist: "No Doubt", songTitle: "Sunday Morning"},
{trackNumber: "06", genreKey: "CY", artist: "Josh Turner", songTitle: "Long Black Train"},
{trackNumber: "07", genreKey: "AR", artist: "Coldplay", songTitle: "Something Just Like This"},
{trackNumber: "08", genreKey: "CY", artist: "Rascal Flatts", songTitle: "Life Is A Highway"},
{trackNumber: "09", genreKey: "AR", artist: "Bush", songTitle: "Glycerine"},
{trackNumber: "10", genreKey: "IND", artist: "Foster The People", songTitle: "Pumped Up Kicks"}
]

const UserPlaylists = () => {
const [showAroundTheWorld, setShowAroundTheWorld] = useState(false)
const [showEasyListening, setShowEasyListening] = useState(false)
const [showDanceVibes, setShowDanceVibes] = useState(false)
const [showSuperDuper, setShowSuperDuper] = useState(false)
return (
 <div className="UserPlaylists">
      <body style={{
                  textAlign: 'center',
                  backgroundImage: `url("https://i.pinimg.com/736x/75/dd/21/75dd21ea7198775928f4942f8c8e01e6.jpg")`,
                  backgroundSize: 'cover',
                  backgroundRepeat: 'no-repeat',
                  width: '100vw',
                  height: '100vh',
                  color: 'white',
                  fontWeight: '700',
                  textShadow: '5px 5px 5px blue'
      }}>
      <h3><center>BD6 Playlists</center></h3>
      <button style={{
                    marginTop: '50px',
                    padding: '20px',
                    fontSize: '18px',
                    border: '3px solid blue',
                    backgroundColor: 'black',
                    fontWeight: 'bold',
                    color: 'blue',
                    textAlign: 'center'
                    }}
      onClick={() => setShowAroundTheWorld(!showAroundTheWorld)}>Around The World</button>
      {showAroundTheWorld && <div>
      {aroundTheWorld.map(song => {return (
      <p><center>{song.artist}: {song.songTitle}</center></p>)})}
      <br/>
      <button style={{
                    marginTop: '50px',
                    padding: '20px',
                    fontSize: '18px',
                    border: '3px solid blue',
                    backgroundColor: 'grey',
                    fontWeight: 'bold',
                    color: 'blue',
                    textAlign: 'center'
      }}
      onClick={() => {window.location = window.location.origin+"/underground"}}> Generate Underground Playlist </button>
      </div>}
      <br/>

      <button  style={{
                     marginTop: '50px',
                     padding: '20px',
                     fontSize: '18px',
                     border: '3px solid blue',
                     backgroundColor: 'black',
                     fontWeight: 'bold',
                     color: 'blue',
                     textAlign: 'center'
                     }}
      onClick={() => setShowEasyListening(!showEasyListening)}>Easy Listening</button>
      {showEasyListening && <div>
      {easyListening.map(song => {return (
      <p><center>{song.artist}: {song.songTitle}</center></p>)})}
      </div>}
      <br/>

      <button style={{
                     marginTop: '50px',
                     padding: '20px',
                     fontSize: '18px',
                     border: '3px solid blue',
                     backgroundColor: 'black',
                     fontWeight: 'bold',
                     color: 'blue',
                     textAlign: 'center'
                     }}
      onClick={() => setShowDanceVibes(!showDanceVibes)}>Dance Vibes</button>
      {showDanceVibes && <div>
      {danceVibes.map(song => {return (
      <p><center>{song.artist}: {song.songTitle}</center></p>)})}
      </div>}
      <br/>

      <button style={{
                      marginTop: '50px',
                      padding: '20px',
                      fontSize: '18px',
                      border: '3px solid blue',
                      backgroundColor: 'black',
                      fontWeight: 'bold',
                      color: 'blue',
                      textAlign: 'center'
                      }}
      onClick={() => setShowSuperDuper(!showSuperDuper)}>Super Duper</button>
      {showSuperDuper && <div>
      {superDuper.map(song => {return (
      <p><center>{song.artist}: {song.songTitle}</center></p>)})}
      </div>}
      </body>
 </div>

)
}
export default UserPlaylists;