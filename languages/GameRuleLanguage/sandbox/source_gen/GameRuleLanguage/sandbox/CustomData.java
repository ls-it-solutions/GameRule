package GameRuleLanguage.sandbox;

/*Generated by MPS */

import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class CustomData implements Map<String, Object> {
  private Map<String, Object> data;
  public CustomData() {
  }
  @Override
  public int size() {
    return data.size();
  }
  @Override
  public boolean isEmpty() {
    return data.isEmpty();
  }
  @Override
  public boolean containsKey(Object key) {
    return data.containsKey(key);
  }
  @Override
  public boolean containsValue(Object value) {
    return data.containsValue(value);
  }
  @Override
  public Object get(Object key) {
    return data.get(key);
  }
  @Override
  public Object put(String key, Object value) {
    return data.put(key, value);
  }
  @Override
  public Object remove(Object key) {
    return data.remove(key);
  }
  @Override
  public void putAll(Map<? extends String, ? extends Object> m) {
    data.putAll(m);
  }
  @Override
  public void clear() {
    data.clear();
  }
  @Override
  public Set<String> keySet() {
    return data.keySet();
  }
  @Override
  public Collection<Object> values() {
    return data.values();
  }
  @Override
  public Set<Map.Entry<String, Object>> entrySet() {
    return data.entrySet();
  }
  @Override
  public String toString() {
    return data.toString();
  }
}
