$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: getHeaders()
  });
  const usuarios = await request.json();

  let usuario = usuario.id
}

async function registrarTutores() {
  let datos = {};

  datos.experienciaEducativa = document.getElementById('txtexperienciaEducativa').value;
  datos.areasEspecializacion = document.getElementById('txtareasEspecializacion').value;
  datos.tarifaPorHora = document.getElementById('txttarifaPorHora').value;


  const request = await fetch('api/tutores', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  alert("La cuenta fue actualizada con exito!");
  window.location.href = 'index.html'

}

