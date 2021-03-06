/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.shrinkwrap.resolver.api.maven;

import org.jboss.shrinkwrap.resolver.api.Child;

/**
 * A builder which allows user to specify a repository by hand, without relying on settings.xml or pom.xml file
 *
 * @author <a href="kpiwko@redhat.com">Karel Piwko</a>
 *
 */
public interface MavenRepositoryBuilder extends Child<MavenDependencyResolver> {

    /**
     * Modifies the layout of the repository. Can be either the default or legacy layout.
     *
     * @param layout Changes the layout of last added repository
     * @return The modified instance to allow chaining
     */
    MavenRepositoryBuilder layout(String layout);

    /**
     * Adds a new repository specified by and url
     *
     * @param url the url of the repository
     * @return The modified instance to allow chaining
     */
    MavenRepositoryBuilder repository(String url);
}
