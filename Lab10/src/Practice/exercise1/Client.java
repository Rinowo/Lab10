package Practice.exercise1;

public class Client {

    public Client () {
        String  value;
    }

    public void doUnchecked(String value) {
        //Cần phải check exception, nếu không --> bug
        int result = canThrowuncheckedExeption(value);
        System.out.println("Result = "+ result);
    }

    public int canThrowuncheckedExeption(String value) {
        return Integer.parseInt(value);
    }

    public void doChecked() {
        try {
            //Buộc phải check exceptions ở đây! Không cách nào khác
            canThrowcheckedExeption();
            System.out.println("OK");
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public int canThrowcheckedExeption() throws Exception {
        throw new Exception("Failure");
    }
}
