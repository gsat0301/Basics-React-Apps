import './App.css';
import logo from './imagenes/logo-intelnova-blanco.png';
import Boton from './componentes/boton';
import Pantalla from './componentes/pantalla';
import Clear from './componentes/clear';
import { useState } from 'react';
import { evaluate, im } from 'mathjs';

function App() {

  const [input, setInput] = useState('');

  const agregarInput = val =>{
    setInput(input + val);
  }

  const calcularResultado = () =>{
    try{
      if (input){
        setInput(evaluate(input));
      } else {
        alert('Ingrese valores a calcular');
      }
    } catch(error){
      alert('Error de sintaxis: Borre e intente nuevamente' + error.message);
    }
  }

  return (
    <div className="App">
        <div className="Logo-contenedor">
          <img src={logo} alt="logo" className="Logo" />
        </div>
        <div className="contenedor-calculadora">
          <Pantalla input={input}/>
          <div className="fila">
            <Boton manejarClick= {agregarInput}>1</Boton>
            <Boton manejarClick= {agregarInput}>2</Boton>
            <Boton manejarClick= {agregarInput}>3</Boton>
            <Boton manejarClick= {agregarInput}>+</Boton>
          </div>
          <div className="fila">
            <Boton manejarClick= {agregarInput}>4</Boton>
            <Boton manejarClick= {agregarInput}>5</Boton>
            <Boton manejarClick= {agregarInput}>6</Boton>
            <Boton manejarClick= {agregarInput}>-</Boton>
          </div>
          <div className="fila">
            <Boton manejarClick= {agregarInput}>7</Boton>
            <Boton manejarClick= {agregarInput}>8</Boton>
            <Boton manejarClick= {agregarInput}>9</Boton>
            <Boton manejarClick= {agregarInput}>*</Boton>
          </div>
          <div className="fila">
            <Boton manejarClick= {calcularResultado}>=</Boton>
            <Boton manejarClick= {agregarInput}>0</Boton>
            <Boton manejarClick= {agregarInput}>.</Boton>  
            <Boton manejarClick= {agregarInput}>/</Boton>
          </div>
          <div className="fila">
            <Clear manejarClear={() => setInput('')}>Borrar</Clear>
          </div>


        </div>
    </div>
  );
}

export default App;
