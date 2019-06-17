package jp.co.panpanini

import org.pitest.mutationtest.ListenerArguments
import org.pitest.mutationtest.MutationResultListener
import org.pitest.mutationtest.MutationResultListenerFactory
import java.util.*

class PitestReporterFactory : MutationResultListenerFactory {
    override fun description(): String = "panini pitest reporter"

    override fun name(): String = "panini"

    override fun getListener(props: Properties?, args: ListenerArguments?): MutationResultListener = PitestReporter()
}