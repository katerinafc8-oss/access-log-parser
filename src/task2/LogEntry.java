package task2;

public class LogEntry {

    private String ipAddress;
    private String ident;
    private String authUser;
    private String timestamp;
    private String method;
    private String path;
    private String statusCode;
    private String responseSize;
    private String referer;
    private String userAgent;

    public LogEntry(String ipAddress, String ident, String authUser,
                    String timestamp, String method, String path,
                    String statusCode, String responseSize,
                    String referer, String userAgent) {
        this.ipAddress = ipAddress;
        this.ident = ident;
        this.authUser = authUser;
        this.timestamp = timestamp;
        this.method = method;
        this.path = path;
        this.statusCode = statusCode;
        this.responseSize = responseSize;
        this.referer = referer;
        this.userAgent = userAgent;
    }

    public String getIpAddress() { return ipAddress; }
    public String getIdent() { return ident; }
    public String getAuthUser() { return authUser; }
    public String getTimestamp() { return timestamp; }
    public String getMethod() { return method; }
    public String getPath() { return path; }
    public String getStatusCode() { return statusCode; }
    public String getResponseSize() { return responseSize; }
    public String getReferer() { return referer; }
    public String getUserAgent() { return userAgent; }

    @Override
    public String toString() {
        return "LogEntry{\n" +
                "  IP-адрес: " + ipAddress + "\n" +
                "  Ident (пропуск 1): " + ident + "\n" +
                "  AuthUser (пропуск 2): " + authUser + "\n" +
                "  Дата и время: " + timestamp + "\n" +
                "  HTTP метод: " + method + "\n" +
                "  Путь запроса: " + path + "\n" +
                "  Код ответа: " + statusCode + "\n" +
                "  Размер ответа: " + responseSize + " байт\n" +
                "  Referer: " + referer + "\n" +
                "  User-Agent: " + userAgent + "\n" +
                "}";
    }
}
