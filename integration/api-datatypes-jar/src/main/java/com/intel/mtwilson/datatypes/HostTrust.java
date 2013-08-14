/*
 * Copyright (c) 2013, Intel Corporation. 
 * All rights reserved.
 * 
 * The contents of this file are released under the BSD license, you may not use this file except in compliance with the License.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of Intel Corporation nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intel.mtwilson.datatypes;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author dsmagadx
 */
public class HostTrust extends AuthResponse{

    private String hostName;
    private Integer vmmStatus;
    private Integer biosStatus;
    
    

    public HostTrust(ErrorCode errorCode, String errorMessage) {
        super(errorCode,new Object[]{errorMessage});
    }
    
    private HostTrust(){
        
    }
    
    

    public HostTrust(String hostName, Integer vmmStatus, Integer biosStatus) {
        super(ErrorCode.OK);
        setIpAddress(hostName);
        setVmmStatus(vmmStatus);
        setBiosStatus(biosStatus);
    }
    
    public HostTrust(ErrorCode errorCode,String errorMessage,String hostName, Integer vmmStatus, Integer biosStatus  ){
        super(errorCode,(errorMessage != null)?new Object[]{errorMessage}:null);
        setIpAddress(hostName);
        setVmmStatus(vmmStatus);
        setBiosStatus(biosStatus);
    }

    @JsonProperty("bios_status")
    public Integer getBiosStatus() {
        return biosStatus;
    }

    @JsonProperty("bios_status")
    public void setBiosStatus(Integer biosStatus) {
        this.biosStatus = biosStatus;
    }

    @JsonProperty("host_name")
    public String getIpAddress() {
        return hostName;
    }

    @JsonProperty("host_name")
    public void setIpAddress(String hostName) {
        this.hostName = hostName;
    }

    @JsonProperty("vmm_status")
    public Integer getVmmStatus() {
        return vmmStatus;
    }

    @JsonProperty("vmm_status")
    public void setVmmStatus(Integer vmmStatus) {
        this.vmmStatus = vmmStatus;
    }
}
