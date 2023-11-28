// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarTutorias();
  $('#sesiones_tutoria').DataTable();
});


async function cargarTutorias() {
  const request = await fetch('api/tutorias', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json',
    },
  });
  const tutorias = await request.json();


  let listadoHtml = '';
  for (let tutoria of tutorias) {
    let botonEliminar = '<a href="#" onclick="eliminarTutoria(' + usuario.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

    let tutoriaHtml = '<tr><td>'+tutoria.id+'</td><td>' + tutoria.nombre_tutoria + ' ' + tutoria.tutor_id + '</td><td>'
                    + tutoria.fecha+'</td><td>'+ tutoria.hora
                    + '</td><td>' + botonEliminar + '</td></tr>';
    listadoHtml += tutoriaHtml;
  }

document.querySelector('#sesiones_tutoria tbody').outerHTML = listadoHtml;

}