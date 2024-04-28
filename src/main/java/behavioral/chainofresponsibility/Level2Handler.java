package behavioral.chainofresponsibility;

public class Level2Handler implements Handler{
    private Handler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.INTERMEDIATE)
            System.out.println("Handler 2 attended the request");
        else if(nextHandler!=null)
            nextHandler.handleRequest(request);
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
