package StructuralPatterns.Adapter.Exercise;

import java.util.ArrayList;
import java.util.List;
import StructuralPatterns.Adapter.Exercise.Gmail.GmailClient;

public class EmailClient {
  private List<EmailProvider> providers = new ArrayList<>();

  public void addProvider(EmailProvider provider) {
    providers.add(provider);
  }

  public void downloadEmails() {
    for (var provider : providers)
      provider.downloadEmails();
  }
}
