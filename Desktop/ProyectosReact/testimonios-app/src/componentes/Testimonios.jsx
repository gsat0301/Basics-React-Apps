import React from "react";
import '../style-sheets/Testimonio.css'

function Testimonio(props){
  return(
    <div className="contenedor-testimonio">
      <img className="Foto-perfil-testimonio"
      src= {require(`../imagenes/Testimonio-${props.imagen}.png`)}
      alt="Foto de perfil"/>
        <div className="contenedor-texto-testimonio">

          <p className="nombre-testimonio">
            <strong>{props.nombre}</strong> de <strong>{props.pais}</strong>
          </p>

          <p className="cargo-testimonio">
            <strong>{props.cargo}</strong> en <strong>{props.empresa}</strong>
          </p>

          <p className="texto-testimonio">"{props.testimonio}"</p>
          
        </div>
    </div>
  );
}
export default Testimonio;