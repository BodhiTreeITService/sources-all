/*
 * Copyright 2002-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.web.authentication;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;

import org.springframework.security.core.AuthenticationException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoInteractions;

class NoOpAuthenticationEntryPointTests {

	private final NoOpAuthenticationEntryPoint authenticationEntryPoint = new NoOpAuthenticationEntryPoint();

	@Test
	void commenceWhenInvokedThenDoesNothing() throws Exception {
		HttpServletRequest request = mock(HttpServletRequest.class);
		HttpServletResponse response = mock(HttpServletResponse.class);
		AuthenticationException exception = mock(AuthenticationException.class);
		this.authenticationEntryPoint.commence(request, response, exception);
		verifyNoInteractions(request, response, exception);
	}

}
