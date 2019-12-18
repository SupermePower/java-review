package cn.com.nb.hello;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReadFIle {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(7701);
        Socket socket = serverSocket.accept();
        //3、获取输入流，并读取客户端信息
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String info = null;
        info = br.readLine();
        File file = new File(info);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader fileisr = new InputStreamReader(fileInputStream);
        BufferedReader filebr = new BufferedReader(fileisr);
        String fileContent = "";
        while ((fileContent = filebr.readLine()) != null) {
            System.out.println(fileContent);
        }
        socket.shutdownInput();//关闭输入流
        //5、关闭资源
        close(serverSocket, socket, is, isr, br);
    }

    /**
     * 关闭资源
     *
     * @param serverSocket
     * @param socket
     * @param is
     * @param isr
     * @param br
     * @throws IOException
     */
    private static void close(ServerSocket serverSocket, Socket socket, InputStream is, InputStreamReader isr,
                              BufferedReader br) throws IOException {
        br.close();
        isr.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
