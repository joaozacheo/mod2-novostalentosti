package sistema.service;

import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.GregorianCalendar;

import sistema.dao.ClienteDAO;
import sistema.entity.Cliente;

public class ClienteService {
    //private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ClienteDAO clienteDAO = new ClienteDAO();

    public ClienteService(){
        /*var cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Zezinho");
        cliente1.setCPF("555.555.555-55");
        Calendar data1 = GregorianCalendar.getInstance();
        data1.set(2004,05,12);
        cliente1.setDataNascimento(data1.getTime());
        listaClientes.add(cliente1);

        var cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Carlinhos");
        cliente2.setCPF("222.222.222-22");
        Calendar data2 = GregorianCalendar.getInstance();
        data2.set(1985,02,6);
        cliente2.setDataNascimento(data2.getTime());
        listaClientes.add(cliente2);

        var cliente3 = new Cliente();
        cliente3.setId(3);
        cliente3.setNome("Joãozinho");
        cliente3.setCPF("333.333.333-33");
        Calendar data3 = GregorianCalendar.getInstance();
        data3.set(1974,10,15);
        cliente3.setDataNascimento(data3.getTime());
        listaClientes.add(cliente3);*/
    }

    public ArrayList<Cliente> getAllClientes(){
        return clienteDAO.getAll();
    }

    public Cliente save(Cliente cliente){
        //listaClientes.add(cliente);
        clienteDAO.save(cliente);
        return cliente;
    }

    public void remove(Cliente cliente) {
        clienteDAO.delete(cliente.getId());
    }
}
