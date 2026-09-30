// Bloque: productoTerminado (Sink) - Accion "On enter"
// Actualiza los indicadores de salida
terminadas++;
tiempoTotalSistema += time() - agent.horaLlegada;
tiempoPromedioSistema = tiempoTotalSistema / terminadas;
