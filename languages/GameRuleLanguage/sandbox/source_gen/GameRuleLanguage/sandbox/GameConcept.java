package GameRuleLanguage.sandbox;

/*Generated by MPS */

import java.util.Map;

public abstract class GameConcept {
  protected String id;
  protected String name;
  public GameConcept(String name) {
    this.name = name;
  }
  public GameConcept() {
  }
  public GameConcept(Map<String, Object> jsonProps) {
    if (jsonProps != null) {
      Object idField = jsonProps.get("id");
      id = ((idField != null) ? String.valueOf(idField) : null);
      name = (String) jsonProps.get("name");
    }
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
