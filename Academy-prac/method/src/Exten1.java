public class Exten1 {
  private int num;
  private String subject;
  private String content;
  private String writer;

  public Exten1(int num, String subject, String content, String writer) {
    this.num = num;
    this.subject = subject;
    this.content = content;
    this.writer = writer;
  }
  
  public int getNum() {
    return this.num;
  }
  
  public void setNum(int num) {
    this.num = num;
  }
  
  public String getSubject() {
    return this.subject;
  }
  
  public void setSubject(String subject) {
    this.subject = subject;
  }
  
  public String getContent() {
    return this.content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
  
  public String getWriter() {
    return this.writer;
  }
  
  public void setWriter(String writer) {
    this.writer = writer;
  }
}

