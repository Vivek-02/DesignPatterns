package behavioral.chainofresponsibility;

public class Level3Handler implements Handler{
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.CRITICAL)
            System.out.println("Handler 3 attended the request");
        else
            System.out.println("Request cannot be handled");
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
