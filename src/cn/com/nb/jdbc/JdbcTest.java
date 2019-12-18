package cn.com.nb.jdbc;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
        JdbcTools jdbcTools = new JdbcTools();
        String sql = "select * from public_sea_pool";
        boolean count = jdbcTools.executeSql(sql);
        if (count) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("--34567890---");
    }
}
