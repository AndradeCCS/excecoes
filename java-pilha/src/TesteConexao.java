public class TesteConexao {
    public static void main(String[] args) {
        /*
        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        }catch (IllegalStateException e){
            System.out.println("deu erro na conexão " + e);

            //Finaly sempre é executado
        }finally {
            System.out.println("Finaly!");
            if (con != null){
            }
        }
        */

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        }  catch (IllegalStateException e){
            System.out.println("Erro de Conexão " + e);
        }
    }
}
