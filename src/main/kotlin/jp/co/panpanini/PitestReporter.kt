package jp.co.panpanini

import org.pitest.mutationtest.ClassMutationResults
import org.pitest.mutationtest.MutationResultListener

class PitestReporter : MutationResultListener {
    override fun handleMutationResult(results: ClassMutationResults?) {
        results ?: return

        println(results.fileName)

        results.mutations.forEach {
            println(it)
        }


    }

    override fun runStart() {
    }

    override fun runEnd() {
    }
}