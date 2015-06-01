/**
 * Copyright 2015 DuraSpace, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fcrepo.kernel.exception;

/**
 * Fedora does not accept RDF with subjects that are not local to the repository.
 *
 * @author whikloj
 * @since 2015-05-29
 */
public class OutOfDomainSubjectException extends ConstraintViolationException {

    private static final long serialVersionUID = 1L;

    /**
     * Takes the subject that is out of domain, creates message.
     *
     * @param subject the subject
     */
    public OutOfDomainSubjectException(final String subject) {
        super(String.format("RDF Stream contains subject(s) (%s) not in the domain of this repository.", subject));
    }

}
