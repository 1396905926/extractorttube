package org.schabi.newpipe.extractor.exceptions;

/*
 * Created by beneth <bmauduit@beneth.fr> on 07.12.16.
 *
 * Copyright (C) 2016 Christian Schabesberger <chris.schabesberger@mailbox.org>
 * ReCaptchaException.java is part of NewPipe Extractor.
 *
 * NewPipe Extractor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NewPipe Extractor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NewPipe Extractor.  If not, see <http://www.gnu.org/licenses/>.
 */

public class ReCaptchaException extends ExtractionException {
    private final String url;

    public ReCaptchaException(final String message, final String url) {
        super(message);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
