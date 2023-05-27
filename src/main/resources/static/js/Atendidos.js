// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarAtendidos();
  $('#atendidos').DataTable();
  actualizarEmailDelUsuario();
});

function actualizarEmailDelUsuario() {
    document.getElementById('txt-email-usuario').outerHTML = localStorage.email;
}


async function cargarAtendidos() {
  const request = await fetch('api/atendidos', {
    method: 'GET',
    headers: getHeaders()
  });
  const reservas = await request.json();


  let listadoHtml = '';

for (let reserva of reservas) {
    let botonEliminar = '<a href="#"  class="btn btn-danger btn-circle btn-sm"><i class="fas fa-book"></i></a>';



    let reservaHtml = '<tr><td>'+reserva.DNI+'</td><td>' + reserva.Cliente +'</td><td>'
                    + reserva.FechaOrden+'</td><td>'+ reserva.Casillero
                    + '</td><td>' + reserva.Total +'</td><td>'
                    + reserva.Estado +'</td>'
                    + '<td>'+ botonEliminar +'</td></tr>';
    listadoHtml += reservaHtml;
  }

  document.querySelector('#atendidos tbody').outerHTML = listadoHtml;
  }

function getHeaders() {
    return {
     'Accept': 'application/json',
     'Content-Type': 'application/json'

   };
}

