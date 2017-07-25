
package org.jenkinsci.plugins.github_branch_source;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import jenkins.scm.api.trait.SCMSourceTrait;
import jenkins.scm.api.trait.SCMSourceTraitDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class GitHubContextSetter extends SCMSourceTrait {

    @NonNull
    private final String context;

    /**
     * Stapler constructor.
     *
     * @param context the regular expression.
     */
    @DataBoundConstructor
    public GitHubContextSetter(@NonNull String context) {
        this.context = context;
    }

    /**
     * Gets the regular expression.
     *
     * @return the regular expression.
     */
    @NonNull
    public String getContext() {
        return context;
    }

    /**
     * Our descriptor.
     */
    @Extension
    public static class DescriptorImpl extends SCMSourceTraitDescriptor {

        /**
         * {@inheritDoc}
         */
        @Override
        public String getDisplayName() {
            return "GitHub Notification Context Setter";
        }
    }
}
