
import './App.css';
import Boton from './componentes/botonContador';
import intelnovaLogo from './imagenes/logo-intelnova-blanco.png';
import Contador from './componentes/Contador';
import { useState } from 'react';


function App() {
  const [numClicks, setNumclicks] = useState(0);
  const manejarClick = () => {
    setNumclicks(numClicks + 1);

   }
  const reiniciarContador = () => {
    setNumclicks(0);

    }


  return (
    <div className="App">
      <div className="logo-contenedor">
          <img src={intelnovaLogo} className="intelnova-logo" alt="logo" />
      </div>
      <div className="contenedor-principal">
        <Contador numClicks={numClicks}/>
        <Boton texto= "Click" esBotonDeClick={true} manejarClick={manejarClick}/>
        
        <Boton texto= "Reiniciar" esBotonDeClick={false} manejarClick={reiniciarContador}/>
       
      </div>
    </div>
  );
}

export default App;
