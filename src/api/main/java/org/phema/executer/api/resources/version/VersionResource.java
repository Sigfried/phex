package org.phema.executer.api.resources.version;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("version")
public class VersionResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Version getVersion() {
    return new Version();
  }
}
