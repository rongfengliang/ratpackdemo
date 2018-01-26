package dalong;
import ratpack.server.RatpackServer;
class Application {
public static void main(String... args) throws Exception {
    RatpackServer.start(server -> server 
      .handlers(chain -> chain
        .get(ctx -> ctx.render("Hello World!"))
        .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))     
      )
    );
}
}