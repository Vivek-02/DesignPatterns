package behavioral.chainofresponsibility;

public class MainClass {

    public static void main(String[] args) {
        Handler level1Handler = new Level1Handler();
        Handler level2Handler = new Level2Handler();
        Handler level3Handler = new Level3Handler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        level1Handler.handleRequest(request1);
        level1Handler.handleRequest(request2);
        level1Handler.handleRequest(request3);
    }
}
