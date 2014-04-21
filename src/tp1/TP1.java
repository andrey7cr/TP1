/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//http://tutorials.jenkov.com/java-multithreaded-servers/multithreaded-server.html
//http://codigoprogramacion.com/cursos/java/103-sockets-en-java-con-cliente-y-servidor.html#.U1RLU0hn-2w

package tp1;

/**
 *
 * @author Valeria
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MultiThreadedServer server = new MultiThreadedServer(9000);
        new Thread(server).start();
        System.out.println("Start Thread");

        try {
            Thread.sleep(200 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping Server");
        server.stop();
    }

}
