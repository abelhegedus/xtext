/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.resource.uriHell;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.uriHell.AbstractURIHandlerWithEcoreTest;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class FileInSourceAndPackagedProjectTest extends AbstractURIHandlerWithEcoreTest {
  @Override
  public URI getResourceURI() {
    return URI.createURI("platform:/resource/projectName/src/org/packageName/First.ecore");
  }
  
  @Override
  public URI getPackagedResourceURI() {
    return URI.createURI("platform:/resource/projectName/org/packageName/First.ecore");
  }
  
  @Override
  public URI getReferencedURI() {
    return URI.createURI("platform:/resource/other/org/packageName/Second.ecore");
  }
  
  @Override
  public URI getPackagedReferencedURI() {
    return URI.createURI("platform:/resource/other/org/packageName/Second.ecore");
  }
}
