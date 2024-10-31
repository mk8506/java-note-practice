package kr.minj.model;
import lombok.Data;

@Data
public class Titanic {
  private int id;
  private boolean survived;
  private int pclass;
  private String name;
  private String sex;
  private Double age;
  private int sibsp;
  private int parch;
  private Object ticket;
  private Double fare;
  private String cabin;
  private char embarked;
}