public class Conexao extends RuntimeException implements AutoCloseable {
    public Conexao() {
        System.out.println("Abrindo Conxeção");
    }

    public void leDados(){
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Fechando Conexão com Close");
    }
}
