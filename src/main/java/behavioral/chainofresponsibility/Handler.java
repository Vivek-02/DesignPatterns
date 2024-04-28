package behavioral.chainofresponsibility;

public interface Handler {

    void handleRequest(Request request);
    void setNextHandler(Handler handler);
}
