package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }
  
  
  
  @Override
  public void write(String str, int off, int len) throws IOException {
      super.out.write(str.toUpperCase(), off, len);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
      super.out.write(String.valueOf(cbuf).toUpperCase(), off, len);
  }

  @Override
  public void write(int c) throws IOException {
    super.out.write(String.valueOf((char)c).toUpperCase());
  }

}