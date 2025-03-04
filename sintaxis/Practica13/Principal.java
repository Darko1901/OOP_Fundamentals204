package Practica13;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entregas entrega = null;

        String[] opciones = {"Agregar Conductor", "Agregar Vehículo", "Asignar Conductor a Vehículo", "Crear Envío", "Actualizar Estado de Entrega", "Consultar Información de Envío", "Salir"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0:
                    conductor = Conductor.crearConductor();
                    JOptionPane.showMessageDialog(null, "Conductor agregado: " + conductor.getNombre());
                    break;
                case 1:
                    String placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    Double capacidadCarga = null;
                    while (capacidadCarga == null) {
                        try {
                            capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor, ingrese un número para la capacidad de carga.");
                        }
                    }
                    vehiculo = new vehiculo(placa, modelo, capacidadCarga);
                    JOptionPane.showMessageDialog(null, "Vehículo agregado: " + vehiculo.getPlaca());
                    break;
                case 2:
                    if (vehiculo != null && conductor != null) {
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null, "Conductor " + conductor.getNombre() + " asignado al vehículo " + vehiculo.getPlaca());
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe agregar un vehículo y un conductor primero.");
                    }
                    break;
                case 3:
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null, "Envío creado: " + envio.getCodigoEnvio());
                    break;
                case 4:
                    if (entrega == null) {
                        int numeroGuia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de guía de la entrega:"));
                        entrega = new Entregas(numeroGuia);
                    }
                    entrega.actualizarEstado();
                    break;
                case 5:
                    if (envio != null && vehiculo != null && conductor != null && entrega != null) {
                        String info = "Información del Envío:\n" +
                                      "Código de Envío: " + envio.getCodigoEnvio() + "\n" +
                                      "Destino: " + envio.getDestino() + "\n" +
                                      "Peso: " + envio.getPeso() + "\n\n" +
                                      "Información del Vehículo:\n" +
                                      "Placa: " + vehiculo.getPlaca() + "\n" +
                                      "Modelo: " + vehiculo.getModelo() + "\n" +
                                      "Capacidad de Carga: " + vehiculo.getCapacidadCarga() + "\n\n" +
                                      "Información del Conductor:\n" +
                                      "Nombre: " + conductor.getNombre() + "\n" +
                                      "Licencia: " + conductor.getLicencia() + "\n\n" +
                                      "Información de la Entrega:\n" +
                                      "Número de Guía: " + entrega.getNumeroGuia() + "\n" +
                                      "Estado: " + entrega.getEstado();
                        JOptionPane.showMessageDialog(null, info);
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe agregar un envío, un vehículo, un conductor y una entrega primero.");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 6);
    }
}
