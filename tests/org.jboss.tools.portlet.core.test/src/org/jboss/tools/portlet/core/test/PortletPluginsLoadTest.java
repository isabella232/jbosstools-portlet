/*************************************************************************************
 * Copyright (c) 2008-2014 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.jboss.tools.portlet.core.test;

import org.eclipse.core.runtime.Platform;
import org.jboss.tools.tests.AbstractPluginsLoadTest;

public class PortletPluginsLoadTest extends AbstractPluginsLoadTest {
	
	public void testOrgJbossPortletCorePluginIsActivated() {
		assertPluginResolved(Platform.getBundle("org.jboss.tools.portlet.core"));
	}

	public void testOrgJbossPortletUiPluginIsActivated() {
		assertPluginResolved(Platform.getBundle("org.jboss.tools.portlet.ui"));
	}

}
