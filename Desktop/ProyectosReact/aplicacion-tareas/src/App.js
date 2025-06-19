import './App.css';
import logo from "./imagenes/logo-intelnova-blanco.png"
import ListaDeTareas from './componentes/listaDeTareas';


function App() {
  return (
    <div className="Aplicacion-tareas">
      <div className='logo-contenedor'>
        <img src={logo} className='intelnova-logo' alt="logo" 
      />
      </div>

      <div className="tarea-lista-principal">
        <h1>Tareas</h1>
        <ListaDeTareas/>
      </div>
    </div>
  );
}

export default App;
